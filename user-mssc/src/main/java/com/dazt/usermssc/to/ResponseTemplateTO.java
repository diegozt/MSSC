package com.dazt.usermssc.to;

import com.dazt.usermssc.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateTO {

    private User user;
    private DepartmentTO departmentTO;
}
