package TecnicasDeProgramacaoII.ProjetoFactoryMethod;

public class Validando {
    public String validar(String cargo) {
        if (cargo.intern() == "administrativo") {
            Administrativo adm = new Administrativo();
            return adm.relacao();
        } else if (cargo.intern() == "aluno") {
            Aluno aluno = new Aluno();
            return aluno.relacao();
        } else if (cargo.intern() == "coordenador") {
            Coordenador coord = new Coordenador();
            return coord.relacao();
        } else if (cargo.intern() == "diretor") {
            Diretor diretor = new Diretor();
            return diretor.relacao();
        } else if (cargo.intern() == "portaria") {
            Portaria port = new Portaria();
            return port.relacao();
        } else if (cargo.intern() == "professor") {
            Professor prof = new Professor();
            return prof.relacao();
        } else if (cargo.intern() == "vestibulando") {
            Vestibulando vest = new Vestibulando();
            return vest.relacao();
        } else {
            return " não tem nenhuma relação com a instituição, acompanhar até a secretaria";
        }
    }
}