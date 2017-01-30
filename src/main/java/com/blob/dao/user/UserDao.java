package com.blob.dao.user;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import com.blob.dao.common.GenericDao;
import com.blob.model.user.User;

public interface UserDao extends GenericDao<User, Long> {

	@Query(value = "SELECT count(c.id) FROM user c "+
			" INNER JOIN user_personal cpd ON (c.id = cpd.user_id) "+
			" WHERE c.id <> ?1 AND CASE WHEN (?2 IS NULL OR ?2 = '') THEN 1 ELSE c.gid = ?2 END "+
			" AND CONCAT(cpd.first_name, ' ', cpd.last_name) LIKE ?3 AND c.status = 'Active' ",	//	c.gid = ?1 AND CONCAT(cpd.first_name, ' ', cpd.last_name) LIKE ?2 
			nativeQuery = true)
	Long countSagaiProfileResult(String cid, String gid, String name);	//	
	
	@Query(value = "SELECT c.id FROM user c "+
			" INNER JOIN user_personal cpd ON (c.id = cpd.user_id) "+
			" WHERE c.id <> ?1 AND CASE WHEN (?2 IS NULL OR ?2 = '') THEN 1 ELSE c.gid = ?2 END "+
			" AND CONCAT(cpd.first_name, ' ', cpd.last_name) LIKE ?3 AND c.status = 'Active' \n#pageable\n", 
			nativeQuery = true)
	List<BigInteger> searchSagaiProfiles(String cid, String gid, String name, Pageable pageable);
	
	
	@Query(value = "select c.id, c.gid, c.account_id, pd.first_name, pd.last_name, f.father_first_name, f.father_middle_name, " // 0-6
					+" f.father_last_name, f.mamas_native_place, addr1.city_or_town as NativePlace, addr2.city_or_town as CurrentPlace, " // 7-10
					+" addr2.state, occ.occupation, occ.designation, edu.degree, edu.specialization, pd.about_me, "	//	11-16
					+" ad.birth_date, photo.file_name, photo.title, pd.gender "	//	17-20
					+" from user c  "
					+" inner join user_personal pd on (c.id = pd.user_id) "
					+" left outer join user_family f on (c.id = f.user_id) "
					+" left outer join user_astro ad on (c.id = ad.user_id) "
					+" left outer join user_address addr1 on (c.id = addr1.user_id and addr1.address_type = 'Native') "
					+" left outer join user_address addr2 on (c.id = addr2.user_id and addr2.address_type = 'Current') "
					+" left outer join user_occupation occ on (c.id = occ.user_id and occ.sequence_number = 1) "
					+" left outer join user_education edu on (c.id = edu.user_id and edu.sequence_number = 1) "
					+" left outer join user_photo photo on (c.id = photo.user_id and photo.category = 'Sagai' and photo.status = 'Active' and photo.is_sagai_primary = 1) "
					+" where c.id in ( ?1 ) order by c.id desc ", 
					nativeQuery = true)
	List<Object[]> getSagaiProfileSummary(List<BigInteger> userList);
}
