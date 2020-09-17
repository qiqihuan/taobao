package com.user.account.entity.centre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 * 账户和角色的关联对象
 * </p>
 *
 * @author:wells
 * @since:2020/9/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRoleCentre {

    private Integer AccountId;

    private List<Integer> roleIds;

}
