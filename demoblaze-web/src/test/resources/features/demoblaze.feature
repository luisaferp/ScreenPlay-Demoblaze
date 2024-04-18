#language: es
  @Regresion
  Característica: automatizar el login y carrito de compra de demoblaze

    Como un usuario quiero ingresar a demoblaze para comprar productos de la tienda
  @caso1
  Escenario: ingreso exitoso
    Dado que luisa ingresa a demoblaze
    Cuando inicia sesion
    Entonces Verifico que inicio correctamente