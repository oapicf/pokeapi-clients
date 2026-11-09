#tag Class
Protected Class NaturePokeathlonStat

	#tag Property, Flags = &h0
		#tag Note
			The amount of change.
		#tag EndNote
		max_change As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The stat being affected.
		#tag EndNote
		pokeathlon_stat As OpenAPIClient.Models.PokeathlonStatSummary
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
			Name="max_change"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokeathlon_stat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokeathlonStatSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


