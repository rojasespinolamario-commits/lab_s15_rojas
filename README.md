## Cálculo del precio de pedidos según promociones y tipos de clientes

## DIAGRAMA
<img width="1032" height="744" alt="DIAGRAMA S15" src="https://github.com/user-attachments/assets/e1b04700-3607-44c5-a3be-d8f1f0e679ef" />

## Descripción del problema
Una tienda de café necesita implementar un sistema que permita calcular el precio final de los pedidos considerando diferentes tipos de descuentos.
Actualmente la cafeteria maneja diferentes beneficios para sus clientes, como descuentos para estudiantes, clientes frecuentes y promociones especiales.

## Solución propuesta
Para resolver este problema se aplicara el patrón de diseño Strategy.
Este patrón permite separar las diferentes formas de calcular descuentos en clases independientes. De esta manera el sistema puede cambiar la estrategia de descuento que utiliza un pedido sin modificar la logica principal.
