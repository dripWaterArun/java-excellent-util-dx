package com.core.test;


import com.core.util.clone.CopyPros;
import java.lang.reflect.Type;

public interface Copy<T> extends Cloneable{

   @SuppressWarnings("unchecked")
   default T clone(Object obj) {
//      Class clazz = this.getClass();

//      Type genType = clazz.getGenericSuperclass();
//      Type b = ((ParameterizedType) genType).getActualTypeArguments()[0];

//      ParameterizedType p = (ParameterizedType)getClass().getGenericInterfaces()[0];
//      Type type = p.getActualTypeArguments()[0];
//      System.out.println(type);

//      System.out.println(clazz.getSimpleName());
//      System.out.println("b"+b);
//      ParameterizedType pt = (ParameterizedType)gs_type;
//      System.out.println(pt.getActualTypeArguments()[0]);
//      Object object;
//      try {
////         clazz = Class.forName(clazz.getName());
////         object=clazz.newInstance();
////         if (object instanceof clazz)
//         return (T)CopyPros.copyProperties(obj,clazz);
//      }  catch (InstantiationException | IllegalAccessException e) {
//         e.printStackTrace();
//      }
      return (T)CopyPros.copyProperties(obj,this.getClass());
   }


}
