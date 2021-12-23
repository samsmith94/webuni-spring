package hu.webuni.spring.hr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "hr") //yaml-ből tölti be az értékeket
@Component      //hogy injektálni lehesen
public class HrConfigProperties {

    private Salary salary = new Salary();

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    //gyűjtőosztály
    public static class Salary {
        private Default def;
        private Smart smart;

        public Default getDef() {
            return def;
        }

        public void setDef(Default def) {
            this.def = def;
        }

        public Smart getSmart() {
            return smart;
        }

        public void setSmart(Smart smart) {
            this.smart = smart;
        }
    }

    //salary.default... (yml)
    public static class Default {
        private int payrisePercent;

        public int getPayrisePercent() {
            return payrisePercent;
        }

        public void setPayrisePercent(int payrisePercent) {
            this.payrisePercent = payrisePercent;
        }
    }

    //salary.smart... (yml)
    public static class Smart {
        private List<Integer> payrisePercents;
        private List<Double> yearsSpentLimits;

        public List<Integer> getPayrisePercents() {
            return payrisePercents;
        }

        public void setPayrisePercents(List<Integer> payrisePercents) {
            this.payrisePercents = payrisePercents;
        }

        public List<Double> getYearsSpentLimits() {
            return yearsSpentLimits;
        }

        public void setYearsSpentLimits(List<Double> yearsSpentLimits) {
            this.yearsSpentLimits = yearsSpentLimits;
        }
    }
}

