package club.codedemo.configurationpropertiesinspringboot;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 配置员工转换器
 * 将配置中的字符串转换为员工实体
 */
@Component
@ConfigurationPropertiesBinding
public class EmployeeConverter implements Converter<String, Employee> {

    @Override
    public Employee convert(String s) {
        String[] data = s.split(",");
        Employee employee = new Employee();
        employee.setName(data[0]);
        employee.setSalary(Double.parseDouble(data[1]));
        return employee;
    }
}
