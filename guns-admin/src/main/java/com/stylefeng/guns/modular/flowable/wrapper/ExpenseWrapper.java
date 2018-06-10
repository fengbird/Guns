package com.stylefeng.guns.modular.flowable.wrapper;

import com.stylefeng.guns.core.common.constant.state.ExpenseState;
import com.stylefeng.guns.core.base.wrapper.BaseControllerWrapper;

import java.util.Map;

/**
 * 报销列表的包装
 *
 * @author fengshuonan
 * @date 2017年12月4日21:56:06
 */
public class ExpenseWrapper extends BaseControllerWrapper {

    public ExpenseWrapper(Object list) {
        super(list);
    }

    @Override
    public void wrapTheMap(Map<String, Object> map) {
        Integer state = (Integer) map.get("state");
        map.put("stateName", ExpenseState.valueOf(state));
    }

}
