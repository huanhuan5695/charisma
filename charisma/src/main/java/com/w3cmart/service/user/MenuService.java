package com.w3cmart.service.user;

import com.w3cmart.entity.Menu;
import com.w3cmart.entity.MenuCriteria;

import java.util.List;

/**
 * Created by Administrator on 2016/8/28.
 */
public interface MenuService {

    int addRootMenu(Menu menu);

    int updateMenu(Menu menu);

    int deleteMenu(Long id);

    List<Menu> selectByExample(MenuCriteria menuCriteria);

}
