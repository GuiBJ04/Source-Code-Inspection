package br.calebe.ticketmachine.core;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TicketMachineTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(5); // inicializar com valor de ticket
    }

    @Test
    public void testInserirValor() {
        ticketMachine.inserir(10);
        assertEquals(10, ticketMachine.getSaldo());
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testInserirValorInvalido() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(3); // Valor inválido
    }

    // Outros testes podem ser adicionados aqui
}
