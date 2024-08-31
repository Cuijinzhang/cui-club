package com.cui.subject.application.convert;

// 导入所需的类
import com.cui.subject.application.dto.SubjectCategoryDTO; // 导入 SubjectCategoryDTO 类
import com.cui.subject.domain.entity.SubjectCategoryBO; // 导入 SubjectCategoryBO 类
import org.mapstruct.Mapper; // 导入 MapStruct 的 Mapper 注解
import org.mapstruct.factory.Mappers; // 导入 Mappers 工厂类

// 定义一个 MapStruct 映射器接口，用于转换 SubjectCategoryDTO 和 SubjectCategoryBO 之间的对象
@Mapper
public interface SubjectCategoryDTOConverter {

    // 创建一个 SubjectCategoryDTOConverter 接口的单例实例
    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    // 定义一个方法，将 SubjectCategoryDTO 转换为 SubjectCategoryBO
    SubjectCategoryBO convertBoToCategory(SubjectCategoryDTO subjectCategoryDTO);
}
