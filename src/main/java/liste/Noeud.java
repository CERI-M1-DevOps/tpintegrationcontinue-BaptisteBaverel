package liste;

public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Créer un nouveau noeud
     * @param e Valeur du noeud
     * @param suivant Noeud suivant
     */
    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Renvoie la valeur du noeud
     * @return Valeur du noeud
     */
    public Object getElement() {
        return element;
    }

    /**
     * Modifie la valeur d noeud
     * @param element valeur du noeud
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Renvoie le noeud suivant
     * @return Noeud suivant
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Changer le noeud suivant
     * @param suivant nouveau noeud suivant
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Renvoie au format string le noeud
     * @return Format string du noeud
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}
