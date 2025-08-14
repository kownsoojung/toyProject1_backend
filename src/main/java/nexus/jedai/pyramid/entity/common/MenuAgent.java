package nexus.jedai.pyramid.entity.common;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "menu_agent")
@Data
@Builder
public class MenuAgent {
    @Id
    private int id;
    private int centerId;
    private int upperId;
    private int seq;
    private String name;
    private String menuClass;
    private int pageType;
    private String description;
    private int depth;
    private int useFlag;
    private String updateEmployeeId;
    private Date updateTime;

}
