const DataTable = () => {
    return(
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes Visitados</th>
                        <th>Negócios Fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>22/04/2021</td>
                        <td>Barry Allen</td>
                        <td>25</td>
                        <td>12</td>
                        <td>15017.00</td>
                    </tr>
                </tbody>
            </table>
        </div>
    )
}

export default DataTable;