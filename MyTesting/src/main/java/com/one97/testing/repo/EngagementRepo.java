package com.one97.testing.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.one97.testing.vo.Channel;
import com.one97.testing.vo.EngagementMaster;
import com.one97.testing.vo.EngagementMaster.EngagemetBasic;

@Repository
@Transactional
public interface EngagementRepo extends CrudRepository<EngagementMaster, Integer> {
		public List<EngagemetBasic> findByCircleAndContestId(String circle,int contestId);
		EngagementMaster findByCircle(String circle);
		EngagementMaster findFirst1ByCircle(String circle);
		List<EngagementMaster> findByChannelChannelName(String name);
		List<EngagementMaster> findByChannel(Channel channel);
		int countByCircle(String circle);

		
		
		//@Query(value= "UPDATE EngagementMaster em SET em.engagementName = ?1 WHERE em.circle = ?2 and em.zone = ?3",nativeQuery=true)
		@Modifying(clearAutomatically=true)
		@Query(value= "UPDATE EngagementMaster em SET em.engagementName = ?1 WHERE em.circle = ?2 and em.zone = ?3")
		public void updateEngagement(String engagement, String circle, String zone);
}
