package com.demo.comentoStatistic.backendspringbootproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YearMonthCountDto {

    private String yearMonth;
    private int totalCnt;
}
