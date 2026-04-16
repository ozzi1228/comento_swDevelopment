package com.demo.comentoStatistic.backendspringbootproject.dao;

import com.demo.comentoStatistic.backendspringbootproject.dto.YearCountDto;
import com.demo.comentoStatistic.backendspringbootproject.dto.YearMonthCountDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StatisticMapper {

  YearCountDto selectYearLogin(String year);

  YearMonthCountDto selectYearMonthLogin(String yearMonth);

}
