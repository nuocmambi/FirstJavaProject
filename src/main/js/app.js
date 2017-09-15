'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
// end::vars[]

// tag::app[]
class App extends React.Component {

  constructor(props) {
    super(props);

  }



  render() {
    return (
      <div>
        <p>hello world</p>
      </div>
  )
  }
}


// tag::render[]
ReactDOM.render(
<App />, document.getElementById('react')
)
// end::render[]