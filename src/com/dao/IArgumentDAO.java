package com.dao;

import com.entity.ArgumentEntity;
import java.util.*;

public interface IArgumentDAO {
    public ArgumentEntity getArgumentByID(String argumentID);
    public List<ArgumentEntity> getAllArguments();
    public List<ArgumentEntity> getHotArguments();
    public List<ArgumentEntity> getArgumentListByUserID(String userID);
    public List<ArgumentEntity> getArgumentListByTagID(String tagID);
    public boolean addArgument(ArgumentEntity argumentEntity);
    public boolean modifyArgument(ArgumentEntity argumentEntity);
    public boolean deleteArgument(String argumentID);
}
