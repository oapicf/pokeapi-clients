//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_summary.g.dart';

/// PokemonFormSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class PokemonFormSummary implements Built<PokemonFormSummary, PokemonFormSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  PokemonFormSummary._();

  factory PokemonFormSummary([void updates(PokemonFormSummaryBuilder b)]) = _$PokemonFormSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormSummary> get serializer => _$PokemonFormSummarySerializer();
}

class _$PokemonFormSummarySerializer implements PrimitiveSerializer<PokemonFormSummary> {
  @override
  final Iterable<Type> types = const [PokemonFormSummary, _$PokemonFormSummary];

  @override
  final String wireName = r'PokemonFormSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormSummaryBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

