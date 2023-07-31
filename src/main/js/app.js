const React = require('react'); 
const ReactDOM = require('react-dom'); 
const client = require('./client'); 

class App extends React.Component { 

	constructor(props) {
		super(props);
		this.state = {tortas: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/tortas'}).done(response => {
			this.setState({tortas: response.entity._embedded.tortas});
		});
	}

	render() { 
		return (
			<TortaList tortas={this.state.tortas}/>
		)
	}
}

class TortaList extends React.Component{
	render() {
		const tortas = this.props.tortas.map(torta =>
			<Torta key={torta._links.self.href} torta={torta}/>
		);
		return (
			<table border="1">
				<tbody>
					<tr>
						<th>Nombre</th>
						<th>Tipo</th>
						<th>Ingredientes</th>
					</tr>
					{tortas}
				</tbody>
			</table>
		)
	}
}

class Torta extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.torta.nombre}</td>
				<td>{this.props.torta.categoria}</td>
				<td>{this.props.torta.ingredientes}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)