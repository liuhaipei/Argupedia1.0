package com.dao;

import com.entity.ArgumentEntity;
import com.entity.OpinionEntity;

import java.util.List;

public interface IOpinionDAO {

    public ArgumentEntity getArgumentByOpinionID(String opinionID);
    public List<OpinionEntity> getOpinionsByCriticalQuestionID(String criticalQestionID);

}
