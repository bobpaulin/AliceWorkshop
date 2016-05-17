// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.sims2.TeenPersonResource;
import static org.lgna.common.ThreadUtilities.doTogether;
// </editor-fold>

class TeenPerson extends Person {

    public TeenPerson(TeenPersonResource resource) {
        super(resource);
    }

    public void cartwheel(SCamera camera) {
        doTogether(() -> {
            this.move(MoveDirection.LEFT, 2.0, Move.asSeenBy(camera));
        }, () -> {
            this.turn(TurnDirection.LEFT, 1.0, Turn.asSeenBy(this.getPelvis()));
        });
    }

    public void setTeenPersonResource(TeenPersonResource teenPersonResource) {
        this.setJointedModelResource(teenPersonResource);
    }
}
