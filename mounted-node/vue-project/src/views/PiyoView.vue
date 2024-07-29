<script>
import axios from 'axios';
import { mapWritableState } from 'pinia';
import { useStore } from '../stores/store';
export default {
    data() {
        return {
            record: {
                name: '',
                greeting: ''
            }
        }
    },
    computed: {
        ...mapWritableState(useStore, ['greeting'])
    },
    mounted() {
        axios.post('http://localhost:8080/demo/api/piyo', {
            greeting: 'Hello'
        }).then(response => {
            this.record = response.data;
            this.greeting = this.record.greeting;
        });
    }
}
</script>
<template>
    <div>{{ record.name }}</div>
    <div>{{ greeting }}</div>
</template>