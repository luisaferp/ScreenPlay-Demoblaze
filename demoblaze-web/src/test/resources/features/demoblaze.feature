#language: es
  @Regresion
  Característica: automatizar el login y carrito de compra de demoblaze

    Como un usuario quiero ingresar a demoblaze para comprar productos de la tienda
    Antecedentes:
      Dado que luisa ingresa a demoblaze
  @caso1
  Escenario: ingreso exitoso
    Cuando inicia sesion
    Entonces Verifico que inicio correctamente
    @caso2
    Escenario: compra exitosa
      Cuando inicia sesion
      Y escoge un producto y lo agrega al carrito
      Entonces verifica que fue agregado correctamente