package com.example.annotation;

import android.view.View;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ================================================
 * 类名：com.example.annotation
 * 时间：2021/9/13 14:09
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface BGABadge {
    Class<? extends View>[] value() default {};
}
