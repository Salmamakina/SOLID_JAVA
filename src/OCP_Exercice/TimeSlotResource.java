package OCP_Exercice;

public class TimeSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private void markTimeSlotBusy(int resourceId) {
        // Implementation for marking time slot busy
    }

    private void markTimeSlotFree(int resourceId) {
        // Implementation for marking time slot free
    }

    private int findFreeTimeSlot() {
        // Implementation for finding a free time slot
        return 0;
    }
}
