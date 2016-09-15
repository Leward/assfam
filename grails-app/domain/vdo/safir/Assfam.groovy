package vdo.safir

class Assfam {

    String matricule
    String nom
    String prenom
    boolean actif = true
    boolean diplome = false

    static constraints = {
        matricule blank: false
        nom blank: false
        prenom blank: false
    }
}
