package com.demo.comentoStatistic.backendspringbootproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YearCountDto {

    private String year;
    private int totalCnt;

}
