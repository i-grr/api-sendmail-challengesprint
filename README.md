# ✉ API de envio de e-mail

> Sistema de envio de e-mails

## 👨‍💻 Funcionamento

O projeto consiste em uma API Rest de envio de e-mails, onde é possível realizar o envio do e-mail em si, consultar os e-mails enviados e buscar por um e-mail específico.

Obs.: A cada 15s é verificado se existem e-mails para serem enviados, isso com base no status ```PROCESSING``` dos e-mails salvos na base de dados. Após a efetivação do envio do e-mail, o status é atualizado para ```SENT```. Porém caso haja algum problema durante o envio, o status do e-mail será ```ERROR```.

## 💻 Padrões de projeto
Os padrões de projeto que foram aplicados nesse projeto são:
* Builder Pattern;
* Command Pattern;
* DTO Pattern.

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/DaviQuental">
        <img src="https://media-exp1.licdn.com/dms/image/C5603AQEyPKxA1LH6Uw/profile-displayphoto-shrink_800_800/0/1642017466390?e=1669852800&v=beta&t=p2pSP72OmFZkXpN8cOiTBemG-fcjoA0T1ow-26t6noA" width="100px;" alt="Foto do Davi Quental"/><br>
        <sub>
          <b>Davi Quental</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/i-grr">
        <img src="https://avatars.githubusercontent.com/u/68043835?v=4" width="100px;" alt="Foto do Igor Pereira"/><br>
        <sub>
          <b>Igor Pereira</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/lsaque">
        <img src="https://avatars.githubusercontent.com/u/67837824?v=4" width="100px;" alt="Foto do Isaque José"/><br>
        <sub>
          <b>Isaque José</b>
        </sub>
      </a>
    </td><td align="center">
      <a href="https://github.com/Luigi-Braghittoni">
        <img src="https://media-exp1.licdn.com/dms/image/C4D03AQFXmDpeO-GDww/profile-displayphoto-shrink_800_800/0/1600113557537?e=1669852800&v=beta&t=oTxHhW8oBnhl-KzTqXhX4VuYR3S4lj99N3dR_tUbgYg" width="100px;" alt="Foto do Luigi Braghittoni"/><br>
        <sub>
          <b>Luigi Braghittoni</b>
        </sub>
      </a>
    </td><td align="center">
      <a href="https://github.com/Mat-Moreira">
        <img src="https://media-exp1.licdn.com/dms/image/D4E03AQGJp-x2QdmN1Q/profile-displayphoto-shrink_800_800/0/1649202857843?e=1669852800&v=beta&t=iIAQ_qrjZdK_FXT07lPlFvlLErHh1wXiJfU6IJda94Y" width="100px;" alt="Foto do Matheus Moreira"/><br>
        <sub>
          <b>Matheus Moreira</b>
        </sub>
      </a>
    </td>
  </tr>
</table>