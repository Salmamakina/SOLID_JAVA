package OCP_Exercice;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotBusy(int resourceId) {
        // Implementation for marking space slot busy
    }

    private void markSpaceSlotFree(int resourceId) {
        // Implementation for marking space slot free
    }

    private int findFreeSpaceSlot() {
        // Implementation for finding a free space slot
        return 0;
    }
}

