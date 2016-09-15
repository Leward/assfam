import vdo.safir.Assfam

class BootStrap {

    def init = { servletContext ->
        new Assfam(nom: 'McMurfy', prenom: 'Andy', matricule: 'ABC01').save()
        new Assfam(nom: 'Le Briant', prenom: 'Lumière', matricule: 'DEF03').save()
    }
    def destroy = {
    }
}
