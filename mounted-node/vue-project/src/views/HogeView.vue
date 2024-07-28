<script>
import axios from 'axios'
export default {
    data() {
        return {
            title: 'hoge画面'
        }
    },
    methods: {
        test() {
            axios.get('http://localhost:8080/demo/hoge').then(response => console.log(response));
        }
    }
}
</script>
<template>
    <div>{{ title }}</div>
    <button @click="test">test</button>
</template>