# language: es
@validarPDF
Característica: Se debe visualizar el pdf exitosamente

  Escenario: visualizacion exitosa de pdf
    Dado realizo el ingreso a Banistmo
    Cuando selecciono la opcion de Aprender es facil seguido de Legales
    Y debo poder seleccionar FATCA
    Entonces debo poder descargar PDF
