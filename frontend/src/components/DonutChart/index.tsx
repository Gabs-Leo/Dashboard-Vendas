import Chart from "react-apexcharts"

const DonutChart = () => {
    const options = {
        legend:{
            show: true
        }
    }

    const mockData = {
        labels: ['Naruto', 'Goku', 'Ichigo', 'Luffy', 'Natsu'],
        series: [488596, 456789, 123456, 654987, 985412]
    }
    return (
        <Chart 
            options={{...options, labels: mockData.labels}}
            series={mockData.series}
            type="donut"
            height="240"
        />
    )
}

export default DonutChart;