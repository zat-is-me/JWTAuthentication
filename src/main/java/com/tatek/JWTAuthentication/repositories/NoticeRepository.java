package com.tatek.JWTAuthentication.repositories;

import com.tatek.JWTAuthentication.entities.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {

    @Query(value = "from Notice n where createDt BETWEEN noticBegDt AND noticEndDt")
    List<Notice> findAllActiveNotices();

}
