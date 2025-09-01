DESAFIO: Componentes e injeção de dependência 
Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem 
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor 
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte: 
<img width="665" height="482" alt="image" src="https://github.com/user-attachments/assets/09644c71-3c79-4e35-b97c-c5b6c657b369" />

Sua solução deverá seguir as seguintes especificações: 
Um pedido deve ser representado por um objeto conforme projeto abaixo:

<img width="145" height="105" alt="image" src="https://github.com/user-attachments/assets/f938c20f-1775-43a0-9b5e-4f001ffd1288" />

A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada 
um com sua responsabilidade, conforme projeto abaixo:

<img width="574" height="73" alt="image" src="https://github.com/user-attachments/assets/126d50a4-9b45-4399-9e07-786692a1a1b5" />

Serviço OrderService: responsável por operações referentes a pedidos. 
Serviço ShippingService: responsável por operações referentes a frete. 
Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log 
do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com 
@Service.



