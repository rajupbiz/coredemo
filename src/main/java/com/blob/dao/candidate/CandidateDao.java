package com.blob.dao.candidate;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import com.blob.dao.common.GenericDao;
import com.blob.model.candidate.Candidate;

public interface CandidateDao extends GenericDao<Candidate, Long> {

	Candidate findByGid(String gid);

	@Query(value = "SELECT count(c.id) FROM candidate c "+
			" INNER JOIN candidate_personal_detail cpd ON (c.id = cpd.candidate_id) "+
			" WHERE CONCAT(cpd.first_name, ' ', cpd.last_name) LIKE ?1 AND c.status = 'Active' ", 
			nativeQuery = true)
	Long countResult(String name);
	
	@Query(value = "SELECT c.id FROM candidate c "+
			" INNER JOIN candidate_personal_detail cpd ON (c.id = cpd.candidate_id) "+
			" WHERE CONCAT(cpd.first_name, ' ', cpd.last_name) LIKE ?1 AND c.status = 'Active' \n#pageable\n", 
			nativeQuery = true)
	List<BigInteger> searchCandidates(String name, Pageable pageable);
	
	
	@Query(value = "select c.id, c.gid, c.user_id, pd.first_name, pd.last_name, f.father_first_name, f.father_middle_name, " 
					+" f.father_last_name, f.mamas_native_place, addr1.city_or_town as NativePlace, addr2.city_or_town as CurrentPlace,  "
					+" addr2.state_id, occ.occupation_id, occ.designation_id, edu.degree_id, edu.specialization_id, pd.about_me, ad.birth_date "
					+" from candidate c  "
					+" inner join candidate_personal_detail pd on (c.id = pd.candidate_id) "
					+" left outer join candidate_family f on (c.id = f.candidate_id) "
					+" left outer join candidate_astro_detail ad on (c.id = ad.candidate_id) "
					+" left outer join candidate_address addr1 on (c.id = addr1.candidate_id and addr1.address_type = 'Native') "
					+" left outer join candidate_address addr2 on (c.id = addr2.candidate_id and addr2.address_type = 'Current') "
					+" left outer join candidate_occupation occ on (c.id = occ.candidate_id and occ.sequence_number = 1) "
					+" left outer join candidate_education edu on (c.id = edu.candidate_id and edu.sequence_number = 1) "
					+" where c.id in ( ?1 ) ", 
					nativeQuery = true)
	List<Object[]> getCandidatesSummary(List<BigInteger> candidateList);
}
