package com.one97.testing.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.one97.testing.vo.Channel;


@Repository
public interface ChannelRepository extends CrudRepository<Channel, Integer> {
	public Channel findByChannelId(int channelId);

	public List<Channel> findByChannelNameAndChannelId(String name,int id);
}
