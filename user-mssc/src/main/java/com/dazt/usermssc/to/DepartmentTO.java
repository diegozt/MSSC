package com.dazt.usermssc.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentTO {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
