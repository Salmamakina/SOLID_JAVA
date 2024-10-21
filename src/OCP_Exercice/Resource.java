package OCP_Exercice;

public interface Resource {
	int allocate();
    void free(int resourceId);
}
