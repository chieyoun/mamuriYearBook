package com.chieyoun.board.domain.repository;

import com.chieyoun.board.domain.entity.ImgEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImgRepository extends CrudRepository<ImgEntity, Integer> {
    ImgEntity save(ImgEntity boardPicture);

    List<ImgEntity> findAllByBoardIdx(Integer boardIdx);
}
