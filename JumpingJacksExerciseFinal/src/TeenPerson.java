// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.sims2.TeenPersonResource;
import static org.lgna.common.ThreadUtilities.doTogether;
// </editor-fold>

class TeenPerson extends Person {

    public TeenPerson(TeenPersonResource resource) {
        super(resource);
    }

    public void jumpingjack() {
        doTogether(() -> {
            this.getRightShoulder().turn(TurnDirection.BACKWARD, 0.375);
        }, () -> {
            this.getLeftShoulder().turn(TurnDirection.BACKWARD, 0.375);
        }, () -> {
            this.getRightHip().turn(TurnDirection.RIGHT, 0.125);
        }, () -> {
            this.getLeftHip().turn(TurnDirection.LEFT, 0.125);
        });
        doTogether(() -> {
            this.getRightShoulder().turn(TurnDirection.FORWARD, 0.375);
        }, () -> {
            this.getLeftShoulder().turn(TurnDirection.FORWARD, 0.375);
        }, () -> {
            this.getRightHip().turn(TurnDirection.LEFT, 0.125);
        }, () -> {
            this.getLeftHip().turn(TurnDirection.RIGHT, 0.125);
        });
    }

    public void setTeenPersonResource(TeenPersonResource teenPersonResource) {
        this.setJointedModelResource(teenPersonResource);
    }
}
