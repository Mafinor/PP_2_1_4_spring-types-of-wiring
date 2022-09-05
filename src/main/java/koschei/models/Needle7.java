package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    /*
    we don't have to put any fields or methods here, the task will be solved without deth8,
    added for the sake of constructor autowiring
     */
    private Deth8 deth;
    @Autowired
    public Needle7(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }
}
