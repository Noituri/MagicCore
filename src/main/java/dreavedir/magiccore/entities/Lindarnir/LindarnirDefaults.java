package dreavedir.magiccore.entities.Lindarnir;

import java.util.UUID;

public class LindarnirDefaults implements ILindarnir {
    private UUID ownerUID = null;

    @Override
    public void setOwnerUID(UUID ownerUID) {
        this.ownerUID = ownerUID;
    }

    @Override
    public UUID getOwnerUUID() {
        return ownerUID;
    }
}
