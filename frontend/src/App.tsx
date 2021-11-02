import Navbar from "components/Navbar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";

function App() {
  return (
    <>
      <Navbar />

      <div className="container">
        <h1 className="text-primary py-3" >Dashboard de Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5>Todas as vendas</h5>
            <DonutChart />
          </div>
        </div>
        
        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
          
        </div>
        <DataTable />
      </div>

      <Footer />
    </>
  );
}

//Utilizamos className ao invés de "class"
export default App;