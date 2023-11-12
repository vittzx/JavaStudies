package APIsREST;
/*
 * Codigos HTTP: 
 *    200 ok -> a solicitacao foi bem sucedida dependendo do metodo http
 *          Para get: o recurso foi obtido e transmitido no corpo da mensagem
 * 
 *          Para HEAD(Cabecalho): Os cabecalhos de representacao sao incluidos na resposta sem nenhum corpo de mensagem
 *                                Ou seja o cabecalho contem as informacoes uteis e mas nao inclui dados de conteudo no corpo de resposta.
 *          Para put/post: O recurso que descreve o resultado da acao é transmitido no corpo da mensagem
 * 
 *          Para delete: O recurso é anulado pois foi deletado e o corpo da mensagem pode ser nulo ou vazio ou conter informacoes minimas.
 * 
 *          Para Trace: O corpo da mensagem contém a mensagem de requisição recebida pelo servidor.
 * 
 * 
 *   201 Created -> A requisição foi bem sucedida e um novo recurso foi criado como resultado. Normalmente é o status de retorno de metodos como Put ou Post.
 *   202 Accepted -> A requisição foi bem sucedida porém ainda não foi antendida, ou seja o cliente vai esperar um tempo pela resposta, uma resposta assincrona.
 * 
*                   Ex: Processos de longa duracao em servidores, inves de bloquear a conexao ou esperar que a acao seja concluida, eles retornam o codigo 202 
                        E apos algum tempo te enviam outra resposta a parte.
                        
 *   204 NoContent -> A requisição foi bem sucedida mas não há conteúdo para enviar esta solicitação, porém os cabecalhos podem ser úteis.
 * 
 * 
 */

public class CodigoStatusHTTP{
    public static void main(String[] a){

    }
}