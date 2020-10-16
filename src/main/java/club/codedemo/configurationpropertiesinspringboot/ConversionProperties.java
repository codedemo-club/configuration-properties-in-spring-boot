package club.codedemo.configurationpropertiesinspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Configuration
@ConfigurationProperties(prefix = "conversion")
public class ConversionProperties {
    /**
     * 默认的时间单位为ms
     */
    private Duration timeInDefaultUnit;
    /**
     * 在赋值时传入其它单位后缀,比如：ns
     */
    private Duration timeInNano;

    /**
     * 指定默认时间单位为天
     */
    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeInDays;

    /**
     * 默认数据单元为 byte
     */
    private DataSize sizeInDefaultUnit;

    /**
     * 支持传入带后缀的数据单位，比如GB
     */
    private DataSize sizeInGB;

    /**
     * 自定义数据单位为TB
     */
    @DataSizeUnit(DataUnit.TERABYTES)
    private DataSize sizeInTB;

    /**
     * 员工
     * 该类将使用自定义的转换器EmployeeConverter完成转换过程
     */
    private Employee employee;

    public Duration getTimeInDefaultUnit() {
        return timeInDefaultUnit;
    }

    public void setTimeInDefaultUnit(Duration timeInDefaultUnit) {
        this.timeInDefaultUnit = timeInDefaultUnit;
    }

    public Duration getTimeInNano() {
        return timeInNano;
    }

    public void setTimeInNano(Duration timeInNano) {
        this.timeInNano = timeInNano;
    }

    public Duration getTimeInDays() {
        return timeInDays;
    }

    public void setTimeInDays(Duration timeInDays) {
        this.timeInDays = timeInDays;
    }

    public DataSize getSizeInDefaultUnit() {
        return sizeInDefaultUnit;
    }

    public void setSizeInDefaultUnit(DataSize sizeInDefaultUnit) {
        this.sizeInDefaultUnit = sizeInDefaultUnit;
    }

    public DataSize getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(DataSize sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    public DataSize getSizeInTB() {
        return sizeInTB;
    }

    public void setSizeInTB(DataSize sizeInTB) {
        this.sizeInTB = sizeInTB;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
