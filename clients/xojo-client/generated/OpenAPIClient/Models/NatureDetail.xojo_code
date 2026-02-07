#tag Class
Protected Class NatureDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		decreased_stat As OpenAPIClient.Models.StatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		increased_stat As OpenAPIClient.Models.StatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		likes_flavor As OpenAPIClient.Models.BerryFlavorSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		hates_flavor As OpenAPIClient.Models.BerryFlavorSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		berries() As OpenAPIClient.Models.BerrySummary
	#tag EndProperty


	#tag Property, Flags = &h0
		pokeathlon_stat_changes() As OpenAPIClient.Models.NatureDetailPokeathlonStatChangesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		move_battle_style_preferences() As OpenAPIClient.Models.NatureBattleStylePreference
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.NatureName
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
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="decreased_stat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="increased_stat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="likes_flavor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerryFlavorSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hates_flavor"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerryFlavorSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="berries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerrySummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokeathlon_stat_changes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureDetailPokeathlonStatChangesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_battle_style_preferences"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureBattleStylePreference"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureName"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


