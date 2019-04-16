package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.GoodsEntity;

import java.util.Map;

/**
 * 商品管理
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-04-16 13:43:07
 */
public interface GoodsService extends IService<GoodsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

