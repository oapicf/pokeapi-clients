#tag Class
Protected Class EvolutionChainDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		baby_trigger_item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		chain As OpenAPIClient.Models.EvolutionChainDetailChain
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="baby_trigger_item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="chain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionChainDetailChain"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


