package cn.gs.annotation.ownDefinition;

import lombok.Data;

/**
 * @Description:
 * @Author: gaoshuai
 * @Date: 2019/3/7 15:21
 */
@Data
public class Apple {
    @FruitName("苹果")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.OwnColor.BLUE)
    private String appleColor;

    @FruitProvider(id = 1, address = "北京市", name = "北京胡同")
    private String appleProvider;

}
